package com.e2e.whereit.utils;

import static java.lang.System.getProperty;
import static java.nio.file.FileSystems.getDefault;

import java.io.File;

/***
 * Classe contenant les méthodes d'accès fichiers :
 * 
 * @author stephane.joyeux
 *
 */
public class FileHelper {

	private static final String USER_DIR = "user.dir";

	private static final String USER_HOME = "user.home";

	private static final String DOWNLOAD_FOLDER = "Downloads";

	private static final String OS_NAME = "os.name";

	private static final String WINDOWS = "win";

	/* @return : Le répertoire courant du poste cible : */
	public static String getLoadCurrentDirectory() {
		return System.getProperty(USER_DIR);
	}

	/* @return : Le répertoire de téléchargement du poste cible : */
	public static String getDownloadDirectory() {
		return getProperty(USER_HOME) + getDefault().getSeparator() + DOWNLOAD_FOLDER;
	}

	/*
	 * @return True si le fichier existe dans le répertoire de téléchargement du
	 * poste cible .
	 */
	public static boolean isFileDownloaded(String fileNameToFind) {
		File workFolder = new File(getDownloadDirectory());
		for (File listOfFiles : workFolder.listFiles()) {
			if (listOfFiles.isFile()) {
				String fileName = listOfFiles.getName();
				if (fileName.matches(fileNameToFind)) {
					return true;
				}
			}
		}
		return false;
	}
	
	/* @return True si le système d'exploitation est de type windows. */
	public static boolean isWindows() {
		return getOS().contains(WINDOWS);
	}

	/* @return le système d'exploitation. */
	private static String getOS() {
		return getProperty(OS_NAME).toLowerCase();
	}
}
