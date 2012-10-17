import java.io.IOException;
import java.util.zip.ZipFile;
import static java.lang.System.out;

public class TryWithResource {

	static class MyZipFile extends ZipFile{

		public MyZipFile(String zipFileName) throws IOException {
			super(zipFileName);
		}
		
		public void close() throws IOException{
			super.close();
			out.println(this.getClass().getSimpleName() + " closed");
		}
	}
	
	public static void writeToFileZipFileContents(String zipFileName,
			String outputFileName) throws java.io.IOException {

		java.nio.charset.Charset charset = java.nio.charset.Charset
				.forName("US-ASCII");
		java.nio.file.Path outputFilePath = java.nio.file.Paths
				.get(outputFileName);

		// Open zip file and create output file with try-with-resources
		// statement

		try (MyZipFile zf = new MyZipFile(zipFileName);
				java.io.BufferedWriter writer = java.nio.file.Files
						.newBufferedWriter(outputFilePath, charset)) {

			// Enumerate each entry

			for (java.util.Enumeration<?> entries = zf.entries(); entries
					.hasMoreElements();) {

				// Get the entry name and write it to the output file

				String newLine = System.getProperty("line.separator");
				String zipEntryName = ((java.util.zip.ZipEntry) entries
						.nextElement()).getName() + newLine;
				writer.write(zipEntryName, 0, zipEntryName.length());
			}
		}
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		writeToFileZipFileContents("C:\\Users\\B03023\\Documents\\新人教育\\test.zip", "C:\\test.txt");
	}
}
