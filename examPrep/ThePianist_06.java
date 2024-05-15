package examPrep;

import java.util.*;

public class ThePianist_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPieces = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> piecesMap = new LinkedHashMap<>(); //запис: пиеса -> списък с информация {композитор, тоналност}

        for (int piece = 1; piece <= countPieces; piece++) {
            String []pieceData = scanner.nextLine().split("\\|");
            //"{piece}|{composer}|{key}".split("|") -> ["{piece}", "{composer}", "{key}"]

            String pieceName = pieceData[0];
            String composer = pieceData[1];
            String tone = pieceData[2];

            List<String> piecesInfo = new ArrayList<>();
            piecesInfo.add(composer);
            piecesInfo.add(tone);

            piecesMap.put(pieceName, piecesInfo);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            if (command.contains("Add")) {
                //command = "Add|{piece}|{composer}|{key}".split("|") -> ["Add", "{piece}", "{composer}", "{key}"]
                String pieceName = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String tone = command.split("\\|")[3];

                if (piecesMap.containsKey(pieceName)) {
                    System.out.println(pieceName +" is already in the collection!");
                } else {
                    List<String> piecesInfo = new ArrayList<>();
                    piecesInfo.add(composer);
                    piecesInfo.add(tone);
                    piecesMap.put(pieceName, piecesInfo);
                    System.out.printf("%s by %s in %s added to the collection!%n", pieceName, composer, tone);
                }
            } else if (command.contains("Remove")) {
                //command = "Remove|{piece}".split("|") -> ["Remove", "{piece}"]
                String pieceToRemove = command.split("\\|")[1];
                if (piecesMap.containsKey(pieceToRemove)) {
                    piecesMap.remove(pieceToRemove);
                    System.out.printf("Successfully removed %s!%n", pieceToRemove);
                } else {

                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToRemove);
                }
            } else if (command.contains("ChangeKey")) {
                //command = "ChangeKey|{piece}|{new key}".split("|") -> ["ChangeKey", "{piece}", "{newTone}"]
                String pieceName = command.split("\\|")[1];
                String newTone = command.split("\\|")[2];

                if (!piecesMap.containsKey(pieceName)) {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                } else {
                    List<String> pieceInfo = piecesMap.get(pieceName);
                    pieceInfo.set(1, newTone);
                    piecesMap.put(pieceName, pieceInfo);
                    System.out.printf("Changed the key of %s to %s!%n", pieceName, newTone);
                }
            }

            command = scanner.nextLine();
        }

        //print
        piecesMap.entrySet()
                .forEach(entry ->
                        System.out.printf("%s -> Composer: %s, Key: %s%n",
                                entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));


    }
}
