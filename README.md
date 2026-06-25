# ApprovalTests.java.StarterProject

[![Build Status](https://github.com/approvals/ApprovalTests.java.StarterProject/actions/workflows/test.yml/badge.svg)](https://github.com/approvals/ApprovalTests.java.StarterProject/actions/workflows/test.yml)

A starter project for [ApprovalTests](https://github.com/approvals/ApprovalTests.java) with JUnit 5 and Maven. Works on Mac, Linux, and Windows.

## What is ApprovalTests?

ApprovalTests is a testing library that replaces fragile hand-written assertions with a "snapshot" style workflow:

1. Run a test — it captures the output to a `.received` file
2. Review the output and **approve** it by renaming the file to `.approved`
3. Future test runs compare against the approved file — if they match, the test passes

This makes it easy to test complex objects, large outputs, and anything that's hard to assert field-by-field.

## Quick Start

```bash
git clone https://github.com/approvals/ApprovalTests.java.StarterProject.git
cd ApprovalTests.java.StarterProject
./build_and_test    # Mac/Linux
build_and_test.cmd  # Windows
```

## Project Structure

```
src/
  main/java/org/samples/
    Person.java               # Example domain object
  test/java/org/samples/
    SampleTests.java          # Three example tests (start here)
    PackageSettings.java      # Configure the diff reporter for this package
    *.approved.txt / .json    # Approved snapshot files checked into git
```

## The Sample Tests

[`SampleTests.java`](src/test/java/org/samples/SampleTests.java) contains three tests:

**`testNormalJunit`** — a plain JUnit assertion to confirm your setup works.

**`testWithApprovalTests`** — the simplest approval test:
```java
Approvals.verify("Hello World");
```
The approved output lives in `SampleTests.testWithApprovalTests.approved.txt`.

**`testJson`** — approves a Java object serialized as JSON (requires Gson, already included in `pom.xml`):
```java
Person hero = new Person("jayne", "cobb", true, 38);
JsonApprovals.verifyAsJson(hero);
```
The approved output lives in `SampleTests.testJson.approved.json`.

## Approving Output

When a test fails because the received output doesn't match the approved file, you have two options:

- **Use your diff tool** — `PackageSettings.java` configures `DiffReporter`, which opens your diff tool automatically on failure so you can review and accept the change.
- **Approve from the command line** — run `.approval_tests_temp/approve_all.sh` (Mac/Linux) to approve all pending received files at once.

Approved files (`.approved.*`) are committed to git. Received files (`.received.*`) are not.

## Configuring Your Diff Tool

[`PackageSettings.java`](src/test/java/org/samples/PackageSettings.java) sets the reporter for all tests under `org.samples`:

```java
public ApprovalFailureReporter UseReporter = DiffReporter.INSTANCE;
```

`DiffReporter` auto-detects common diff tools. You can also specify one explicitly:

| OS      | Suggested tool |
|---------|----------------|
| Mac     | [DiffMerge](https://sourcegear.com/diffmerge/) |
| Windows | [WinMerge](https://winmerge.org/) |
| Linux   | [Meld](http://meldmerge.org/) |

## Dependencies (pom.xml)

| Dependency | Purpose |
|------------|---------|
| `com.approvaltests:approvaltests` | ApprovalTests library |
| `org.junit.jupiter:junit-jupiter` | JUnit 5 |
| `com.google.code.gson:gson` | JSON serialization for `JsonApprovals` |

## Next Steps

- Delete or modify the sample tests and start writing your own
- Read the [ApprovalTests.java User Guide](https://github.com/approvals/ApprovalTests.Java/blob/master/approvaltests/docs/README.md#top)
- Explore reporters, combinational approvals, and other features in the user guide
