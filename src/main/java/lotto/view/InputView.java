package lotto.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final int LOTTO_VALUE = 1000;
    private static final String DELIMITER = ", ";

    public static int purchaseCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("구입금액을 입력해 주세요.");
        int count = scanner.nextInt() / LOTTO_VALUE;
        System.out.println(count + "개를 구매했습니다.");
        return count;
    }

    public static int purchaseManualCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
        return scanner.nextInt();
    }

    public static List<String> inputManualLottoNumbers(int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("수동으로 구매할 번호를 입력해 주세요");
        List<String> lottoNumbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lottoNumbers.add(scanner.nextLine());
        }
        return lottoNumbers;
    }

    public static int[] getWinLotto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("지난 주 당첨 번호를 입력해 주세요.");
        String[] lotto = scanner.nextLine().split(DELIMITER);
        int[] winLotto = new int[lotto.length];
        for (int i = 0; i < lotto.length; i++) {
            winLotto[i] = Integer.parseInt(lotto[i]);
        }
        return winLotto;
    }

    public static int getBonusNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("보너스 볼을 입력해 주세요.");
        return scanner.nextInt();
    }
}
