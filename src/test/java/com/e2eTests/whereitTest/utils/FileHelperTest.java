package com.e2eTests.whereitTest.utils;

import static com.e2e.whereit.utils.FileHelper.getDownloadDirectory;
import static com.e2e.whereit.utils.FileHelper.getLoadCurrentDirectory;
import static com.e2e.whereit.utils.FileHelper.isFileDownloaded;
import static com.e2e.whereit.utils.FileHelper.isWindows;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FileHelperTest {

	private static final String DOWNLOAD_FOLDER = "C:\\Users\\stephane.joyeux\\Downloads";
	private static final String FILE_TO_TEST = "Passation.xlsx";

	@Test
	public void testGetLoadCurrentDirectory() {
		assertFalse(getLoadCurrentDirectory().isEmpty());
	}

	@Test
	public void testGetDownloadDirectory() {
		assertEquals(DOWNLOAD_FOLDER, getDownloadDirectory());
	}

	@Test
	public void testIsFileDownloaded() {
		assertTrue(isFileDownloaded(FILE_TO_TEST));
	}

	@Test
	public void testIsWindows() {
		if (isWindows()) {
			assertTrue(isWindows());
		} else {
			assertFalse(isWindows());
		}

	}
}
