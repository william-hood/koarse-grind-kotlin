/*

READ ME: KOARSE GRIND EXAMPLE (some editors will hide all but the first line of this comment)

This example is designed for use with IntelliJ IDEA CE. To run it, right-click the green
triangle to the left of the main() function and select the first item at the top
("Run MainKt"). A folder "Test Results" will be created in your documents folder. The
test program output will be created in a new time-stamped subdirectory from there.
Within the output directory will be an "All Tests.html" file, a CSV spreadsheet of
the test results, and PASS/FAIL prefixed artifact directories for each test that ran.

➡️ THIS IS AN EXAMPLE TEST SUITE AND MANY TESTS WON'T PASS FOR ILLUSTRATIVE PURPOSES ⬅️

 */

// ‼️ IMPORTANT ‼️ If a module name, or the name of its directory, contains a space tests in it will not be run.
// So don't do that!

package com.mycompany.testing

import io.github.william_hood.koarse_grind_kotlin.Outfitter
import io.github.william_hood.koarse_grind_kotlin.TestProgram

// First thing's first. Below is all you need for a main() function
// to kick off your tests.
fun main(args: Array<String>) {
    // The line below will force a workaround so at least the HTML
    // output is correct when running on Windows. You may also need
    // to get the new Windows Terminal and Set Windows to use UTF-8
    // by default (like every other OS does). To do this open Windows
    // Settings, then search for and go into Language Settings. Scroll
    // down and click "Administrative language settings", then
    // click "Change system locale" and check the box labeled
    // "Beta: Use Unicode UTF-8 for worldwide language support".
    // As of June 2023 the line below is only necessary on Microsoft
    // Windows and only when not running via IntelliJ or Eclipse.
    System.setProperty("file.encoding", "UTF-8")

    TestProgram.run("Koarse Grind Demo", args = args)
}

// You can put a test in the same file as main() if you want.
// Start with the file "ExampleTestTemplate.kt" for an example of a "normal" test.
// Take a look at "A3 Hoodland Projects Test Suite" for an example of an actual test project.

// If the entire test suite needs a setup and/or cleanup, create an Outfitter
// and omit the categoryPath field (or explicitly specify it to be ""). This
// will assign the outfitter to the top-level category. It's setup will run before
// the entire suite. It's teardown will run after all tests in the suite complete.
class TestSuiteOutfitter: Outfitter() {
    override fun setup() {
        assert.shouldBeTrue(true, "Suite-level setup ran!")
    }

    override fun cleanup() {
        assert.shouldBeTrue(true, "Suite-level cleanup ran!")
    }
}
