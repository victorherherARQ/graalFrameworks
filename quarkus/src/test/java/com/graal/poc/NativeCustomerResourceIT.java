package com.graal.poc;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeCustomerResourceIT extends CustomerResourceTest {

    // Execute the same tests but in native mode.
}