package battleships;

public class Field {

	private static String[][]mSquareArr;
	static String[] mLettersArr = new String[26]; // Alphabet list for field coordinates


	private int mSquareSize; // Define field size; defined by user input

	public Field(int squareSize)
	{
		mSquareSize=squareSize;
		// Fill up alphabet list for field coordinates
		for(char ch ='a';ch<='z';ch++)
		{
			mLettersArr[ch-'a']=String.valueOf(ch);
		}

		// Create field
		mSquareArr = new String[squareSize][squareSize];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<mSquareArr.length;i++)
		{
			for(int j=0;j<mSquareArr.length;j++)
			{
				sb.append(mLettersArr[i]+""+(j+1));
				mSquareArr[i][j]=sb.toString();
				sb.setLength(0);
			}
		}
	}

	// Print line for formatting
	private void printFieldLineDivider()
	{
		System.out.print(" ");
		for (int i=0;i<mSquareSize;i++)
		{
			if(i<9) {
				System.out.print("-----");
			}
			else {
				System.out.print("------");
			}
		}

	}

	// Print the square (ocean) to the screen
	public void printSquare()
	{
		for (int i = 0; i < mSquareArr.length; i++) {

			printFieldLineDivider();
			System.out.println("");
			for (int j = 0; j < mSquareSize; j++) {
				if(j==0)				{
					System.out.print(" | ");
				}
				System.out.print(mSquareArr[i][j]+" | ");
			}
			System.out.println("");
		}
		this.printFieldLineDivider();
		System.out.println(" ");
	}

	public static String[] getmLettersArr() {
		return mLettersArr;
	}

	public static String[][] getmSquareArr() {
		return mSquareArr;
	}

}
