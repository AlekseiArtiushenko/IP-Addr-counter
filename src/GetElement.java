import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.BitSet;

public class GetElement {

    private final String PATH = "C:\\Users\\Алексей\\Downloads\\ip_addresses.txt";

    public int getUniqueDataCount() {
        try (
                BufferedReader reader = Files.newBufferedReader(
                        Paths.get(PATH))
        ) {
            String line;
            BitSet bitSetOne = new BitSet(Integer.MAX_VALUE);
            BitSet bitSetTwo = new BitSet(Integer.MAX_VALUE);

            while ((line = reader.readLine()) != null) {
                InetAddress i = InetAddress.getByName(line);
                int ipAddrIntValue = ByteBuffer.wrap(i.getAddress()).getInt();

                if (ipAddrIntValue > 0) {
                    bitSetOne.set(ipAddrIntValue);
                } else {
                    bitSetTwo.set(-1 * (ipAddrIntValue));
                }
            }

            return bitSetOne.cardinality() + bitSetTwo.cardinality();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
