package de.kaleidox.test.hunspell;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ResourceTest {
  @Test
  public void testDictionaryAvailable() {
    assertNotNull(ClassLoader.getSystemResource("index.dic"));
  }

  @Test
  public void testAffixAvailable() {
    assertNotNull(ClassLoader.getSystemResource("index.aff"));
  }

  @Test
  public void testLicenseAvailable() {
    assertNotNull(ClassLoader.getSystemResource("license"));
    assertNotNull(ClassLoader.getSystemResource("readme.md"));
  }
}
