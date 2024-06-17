import java.util.ArrayList;
import java.util.List;

public class _118_Pascal_s_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> myList = new ArrayList<>();
        if (numRows == 0) {
            return myList;
        } else if (numRows == 1) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            myList.add(row);
            return myList;
        } else if (numRows == 2) {
            List<Integer> row1 = new ArrayList<>();
            row1.add(1);
            myList.add(row1);
            List<Integer> row2 = new ArrayList<>();
            row2.add(1);
            row2.add(1);
            myList.add(row2);
            return myList;
        }
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        myList.add(row1);
        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        myList.add(row2);

        int lengthRow = 3;
        for (int i = 3; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 1; j <= lengthRow; j++) {
                if (j == 1 || j == lengthRow) {
                    row.add(1);
                } else {
                    row.add(myList.get(i - 2).get(j - 2) + myList.get(i - 2).get(j - 1));
                }
            }
            lengthRow++;
            myList.add(row);
        }
        return myList;
    }
}
