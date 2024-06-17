import java.util.ArrayList;
import java.util.List;

public class _119_Pascal_s_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> myList = new ArrayList<>();
        if (rowIndex == 0) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            return row;
        } else if (rowIndex == 1) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            row.add(1);
            return row;
        }
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        myList.add(row1);
        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        myList.add(row2);

        int lengthRow = 3;
        for (int i = 3; i <= rowIndex + 1; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 1; j <= lengthRow; j++) {
                if (j == 1 || j == lengthRow) {
                    row.add(1);
                } else {
                    row.add(myList.get(i - 2).get(j - 2) + myList.get(i - 2).get(j - 1));
                }
            }
            if (i == (rowIndex + 1)) {
                return row;
            }
            lengthRow++;
            myList.add(row);
        }
        return row1;
    }
}
