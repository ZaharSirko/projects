package __k3.sec.lab6;
import java.security.MessageDigest;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class AvalancheEffectAnalyzer {
    private final String originalMessage;
    private final int bitPosition;
    private final int rounds;
    private final int[] bitChangesPerRound;

    public AvalancheEffectAnalyzer(String originalMessage, int bitPosition, int rounds) {
        this.originalMessage = originalMessage;
        this.bitPosition = bitPosition;
        this.rounds = rounds;
        this.bitChangesPerRound = new int[rounds];
    }

    public void analyze() {
        try {
            byte[] originalBytes = originalMessage.getBytes(StandardCharsets.UTF_8);
            byte[] modifiedBytes = originalBytes.clone();

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] originalHash = digest.digest(originalBytes);

            for (int round = 0; round < rounds; round++) {
                modifiedBytes[bitPosition] ^= (1 << (round % 8));
                byte[] modifiedHash = digest.digest(modifiedBytes);
                bitChangesPerRound[round] = countBitChanges(originalHash, modifiedHash);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private int countBitChanges(byte[] hash1, byte[] hash2) {
        int count = 0;
        for (int i = 0; i < hash1.length; i++) {
            byte xor = (byte) (hash1[i] ^ hash2[i]);
            count += Integer.bitCount(xor & 0xFF);
        }
        return count;
    }

    public int[] getBitChangesPerRound() {
        return bitChangesPerRound;
    }


    public void saveAnalysisDataToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int round = 0; round < rounds; round++) {
                writer.write(round + "," + bitChangesPerRound[round]);
                writer.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
