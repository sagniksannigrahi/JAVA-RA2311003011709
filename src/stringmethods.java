public class stringmethods {
    public static void main(String[] args) {
        String name="SAgnik"; //ekhnea SAgnik er "S" er position "0",,"A" er position "1",,evanbea "gnik" er psition "2 3 4 5" ;
        System.out.println(name);

        int value=name.length(); //String er modhyea kotodulo word aschea.
        System.out.println(value);

        String lowerstring = name .toLowerCase(); //name er modhyea jekhanea jekhanea upper case chilo sekanea sekhaneea lower ce cholea asbea.
        System.out.println(lowerstring);

        String upperstring = name .toUpperCase(); //name er modhyea jekhanea jekhanea lowercase letter thakbea sob uppercase letter hoyea jabea.
        System.out.println(upperstring);

        //////////////////////////////////////////////////////////////////////////////

        String nonTrimmedString="     Sampurna   ";
        System.out.println(nonTrimmedString);

        System.out.println(nonTrimmedString.trim()); //uporer Sagnik lekhatar samne pichonea sob s[ace gulo trimmed hoyea jachea.

        System.out.println(name.substring(3)); //evabea koray name=SAgnik er 3 no position thakea baki sesh porjonto(infinite) print hochea


        System.out.println(name.substring(1,4)); //asolea ekhanea 1 position thakea  suru hoyea 4 position er thik agea 3 position tokh run hobea. //end position jeta deoya hobea sear thik agea porjonto run hobea.

        System.out.println(name.replace('k','o')); //ekhanea name er modhyea jekhanea jekhanea k chilo tara o hoyea jabea......ARR EKHANEA brcket er modhyea  double letter deoya cholbea na----ditea holea old char and new char uboyey ditea hobea.("gn","yu")
        System.out.println(name.replace("gn","yu"));

        System.out.println(name.startsWith("SA")); //given jea name ta aschea tar sathea ekhanea bracket er lekhata milllea ans true hobea..nholea false hobea.

        System.out.println(name.endsWith("nIk")); //ekhanea ans false aschea karon ekhanea name er sesea 'nik' aschea ... kintu amr 'nIk' diyeachi.

        System.out.println(name.charAt(2)); //name er 2 no position ea jeta aschea seta print hobea

        System.out.println(name.indexOf("Ag"));//etar dara Ag er first letter A er position dibea.

        System.out.println(name.indexOf("k",2));//ekhanea asolea k takea khoghbea index 2 er por thakea..index 012 tea ja aschea tader ignre korbea oo tarpor 34 er modhyea khoghbea k er position kea...ar jodi ker position na pay tobea reply tea -1 asbea.

        System.out.println(name.lastIndexOf("i")); //manea jodi ekta name ea duto same word thakea manea jemone Harry name tea r dubar aschea ekhanea [name.lastIndexOf("r")] korlea ans 3 asbea jeta holo ditiyo r er position.

        System.out.println(name.lastIndexOf("a",2));///??????????????????????? @29.39 codewith harry

        System.out.println(name.equals("SAgnik"));// ekhanea bhitorea  jeta deoya aschea tar sathea jodi main name ta milea jay tobea anstrue asbea. ...kintu ekhanea lekhaa jodi 'sagnik' kora hoto tobea ans false hotomanea ekhanea uppercase ba lowercase keo same hotea hobea main name er sathea.

        System.out.println(name.equalsIgnoreCase("sagNik"));//ekhanea shudhu value takea check korbea.... uppercase baa lower case jay thakuk na keno kono somosaa ney....kintu 'sagNik' er bodolea onno kichu likhlea result false asbea.

//escape sequence
        System.out.println("I am escape sequence\" its here"); //lekhar maghea quote (") antea gelea

        System.out.println("I am escape sequence\\its here");//lekher maghea ekta slash (\) antea gelea

        System.out.println("I am escape sequence\tits here");//new tab

        System.out.println("I am escape sequence\nits here");//new line

    }
}
