import java.sql.SQLOutput;
import java.util.Scanner; //scanner kea import kora holo /SACNNER er "S" ta boro hobea.
import java.util.SortedMap;

public class SS_take_input {

    public static void main(String[] args) {
        System.out.println("take input");
        Scanner sc= new Scanner(System.in); //sc ekta variable er naam  //System.in er dara-read from  the keyboard

        String str = sc.next(); //ekhtrea jokhon iuser  ekta word er input dibea (ex=sagnik) tokhon set lekha hobea (manea run korlea sagnik asbea)..kintu odi ekadhikh word er input diyy(ex sagnik is a good by) tobea sudhu first word ta run ea dekhabea ( manea sudhu sagnik tay asbea.)==> kintu ekhnea jodi sob word keypetea hoyy tobea [sc.next()] er bodole [sc.nextLine()] likhtea hobea.
        System.out.println(str);

    }
}
