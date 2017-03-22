import static LS.ls.commandLine;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import java.io.*;

public class Tests {
    private void assertFileContent( String name, String expectedContent) throws IOException {
        String content = new String();
        try(FileReader reader = new FileReader(name))
        {
            int c;
            while((c=reader.read())!=-1){
                content+=(char)c;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        assertEquals(expectedContent, content);
    }
    @Test
    @Tag("---d")
    void __od() throws IOException {
        assertFileContent("testOut\\__d", "Ace_Stream_Media_3.1.2.exe\n" +
                "AdbeRdr930_ru_RU.exe\n" +
                "atheros_ar5xxx_ar9xxx_wireless_10_0_0_298_whql.zip\n" +
                "avast_free_antivirus_setup_online_comss.exe\n" +
                "Delphi7_Lite_Full_Setup_v7.3.3.3v3(Build_2010-02-02).exe\n" +
                "DTLiteInstaller.exe\n" +
                "Git-2.10.0-64-bit.exe\n" +
                "K-Lite_Codec_Pack_960_Mega.exe\n" +
                "KMPlayer 2.9.4.1434 Final.exe\n" +
                "mseinstall.exe\n" +
                "online-consultant.exe\n" +
                "TeamViewerPortable\n" +
                "teeworlds-0.5.1-win32\n" +
                "Tor Browser\n" +
                "тема\n");
    }
    @Test
    @Tag("l--f")
    void __of() throws IOException {
        assertFileContent("testOut\\__f", "testIn\\Ace_Stream_Media_3.1.2.exe\n");
    }
    @Test
    @Tag("lh-f")
    void lhof() throws IOException {
        assertFileContent("testOut\\lhf", "testIn\\Ace_Stream_Media_3.1.2.exe  xrw   последние изменение 18.03.2016 05:33:05   75MB\n");

    }
    @Test
    @Tag("---d")
    void l_of() throws IOException {
        assertFileContent("testOut\\l_f", "testIn\\Ace_Stream_Media_3.1.2.exe  111 1458311585083 79522432\n");
    }
    @Test
    @Tag("l--d")
    void l_od() throws IOException {
        assertFileContent("testOut\\l_d", "testIn\\Ace_Stream_Media_3.1.2.exe                                111 1458311585083 79522432\n" +
                "testIn\\AdbeRdr930_ru_RU.exe                                      111 1279732176000 25879608\n" +
                "testIn\\atheros_ar5xxx_ar9xxx_wireless_10_0_0_298_whql.zip        111 1438626227247 81475851\n" +
                "testIn\\avast_free_antivirus_setup_online_comss.exe               111 1438876146121 5481336\n" +
                "testIn\\Delphi7_Lite_Full_Setup_v7.3.3.3v3(Build_2010-02-02).exe  111 1273572330000 65762043\n" +
                "testIn\\DTLiteInstaller.exe                                       111 1438952882607 1709792\n" +
                "testIn\\Git-2.10.0-64-bit.exe                                     111 1473356327247 33049944\n" +
                "testIn\\K-Lite_Codec_Pack_960_Mega.exe                            111 1355557062417 24222983\n" +
                "testIn\\KMPlayer 2.9.4.1434 Final.exe                             111 1338740319172 29391072\n" +
                "testIn\\mseinstall.exe                                            111 1386123358172 13697208\n" +
                "testIn\\online-consultant.exe                                     111 1450679908864 15745976\n" +
                "testIn\\TeamViewerPortable                                        111 1490211686138 4096\n" +
                "testIn\\teeworlds-0.5.1-win32                                     111 1490211585663 0\n" +
                "testIn\\Tor Browser                                               111 1490211628510 0\n" +
                "testIn\\тема                                                      111 1490211649326 4096\n");
    }
    @Test
    @Tag("lh-d")
    void lhod() throws IOException {
        assertFileContent("testOut\\lhd", "Ace_Stream_Media_3.1.2.exe                                xrw   последние изменение 18.03.2016 05:33:05   75MB\n" +
                "AdbeRdr930_ru_RU.exe                                      xrw   последние изменение 21.07.2010 09:09:36   24MB\n" +
                "atheros_ar5xxx_ar9xxx_wireless_10_0_0_298_whql.zip        xrw   последние изменение 03.08.2015 09:23:47   77MB\n" +
                "avast_free_antivirus_setup_online_comss.exe               xrw   последние изменение 06.08.2015 06:49:06   5MB\n" +
                "Delphi7_Lite_Full_Setup_v7.3.3.3v3(Build_2010-02-02).exe  xrw   последние изменение 11.05.2010 02:05:30   62MB\n" +
                "DTLiteInstaller.exe                                       xrw   последние изменение 07.08.2015 04:08:02   1MB\n" +
                "Git-2.10.0-64-bit.exe                                     xrw   последние изменение 08.09.2016 08:38:47   31MB\n" +
                "K-Lite_Codec_Pack_960_Mega.exe                            xrw   последние изменение 15.12.2012 11:37:42   23MB\n" +
                "KMPlayer 2.9.4.1434 Final.exe                             xrw   последние изменение 03.06.2012 08:18:39   28MB\n" +
                "mseinstall.exe                                            xrw   последние изменение 04.12.2013 06:15:58   13MB\n" +
                "online-consultant.exe                                     xrw   последние изменение 21.12.2015 09:38:28   15MB\n" +
                "TeamViewerPortable                                        xrw   последние изменение 22.03.2017 10:41:26   (Папка) 4KB\n" +
                "teeworlds-0.5.1-win32                                     xrw   последние изменение 22.03.2017 10:39:45   (Папка) 0Bait\n" +
                "Tor Browser                                               xrw   последние изменение 22.03.2017 10:40:28   (Папка) 0Bait\n" +
                "тема                                                      xrw   последние изменение 22.03.2017 10:40:49   (Папка) 4KB\n");
    }
    @Test
    @Tag("---d")
    void ___d() throws IOException {
        assertEquals(commandLine("ls testIn"), "Ace_Stream_Media_3.1.2.exe\n" +
                "AdbeRdr930_ru_RU.exe\n" +
                "atheros_ar5xxx_ar9xxx_wireless_10_0_0_298_whql.zip\n" +
                "avast_free_antivirus_setup_online_comss.exe\n" +
                "Delphi7_Lite_Full_Setup_v7.3.3.3v3(Build_2010-02-02).exe\n" +
                "DTLiteInstaller.exe\n" +
                "Git-2.10.0-64-bit.exe\n" +
                "K-Lite_Codec_Pack_960_Mega.exe\n" +
                "KMPlayer 2.9.4.1434 Final.exe\n" +
                "mseinstall.exe\n" +
                "online-consultant.exe\n" +
                "TeamViewerPortable\n" +
                "teeworlds-0.5.1-win32\n" +
                "Tor Browser\n" +
                "тема\n");
    }
    @Test
    @Tag("l--f")
    void ___f() throws IOException {
        assertEquals(commandLine("ls testIn\\Ace_Stream_Media_3.1.2.exe"), "testIn\\Ace_Stream_Media_3.1.2.exe\n");
    }

    @Test
    @Tag("lh-f")
    void lh_f() throws IOException {
        assertEquals(commandLine("ls -l -h testIn\\Ace_Stream_Media_3.1.2.exe"), "testIn\\Ace_Stream_Media_3.1.2.exe  xrw   последние изменение 18.03.2016 05:33:05   75MB\n");
    }

    @Test
    @Tag("---d")
    void l__f() throws IOException {
        assertEquals(commandLine("ls -l testIn\\Ace_Stream_Media_3.1.2.exe"),"testIn\\Ace_Stream_Media_3.1.2.exe  111 1458311585083 79522432\n");
    }
    @Test
    @Tag("l--d")
    void l__d() throws IOException {
        assertEquals(commandLine("ls -l  testIn"), "testIn\\Ace_Stream_Media_3.1.2.exe                                111 1458311585083 79522432\n" +
                "testIn\\AdbeRdr930_ru_RU.exe                                      111 1279732176000 25879608\n" +
                "testIn\\atheros_ar5xxx_ar9xxx_wireless_10_0_0_298_whql.zip        111 1438626227247 81475851\n" +
                "testIn\\avast_free_antivirus_setup_online_comss.exe               111 1438876146121 5481336\n" +
                "testIn\\Delphi7_Lite_Full_Setup_v7.3.3.3v3(Build_2010-02-02).exe  111 1273572330000 65762043\n" +
                "testIn\\DTLiteInstaller.exe                                       111 1438952882607 1709792\n" +
                "testIn\\Git-2.10.0-64-bit.exe                                     111 1473356327247 33049944\n" +
                "testIn\\K-Lite_Codec_Pack_960_Mega.exe                            111 1355557062417 24222983\n" +
                "testIn\\KMPlayer 2.9.4.1434 Final.exe                             111 1338740319172 29391072\n" +
                "testIn\\mseinstall.exe                                            111 1386123358172 13697208\n" +
                "testIn\\online-consultant.exe                                     111 1450679908864 15745976\n" +
                "testIn\\TeamViewerPortable                                        111 1490211686138 4096\n" +
                "testIn\\teeworlds-0.5.1-win32                                     111 1490211585663 0\n" +
                "testIn\\Tor Browser                                               111 1490211628510 0\n" +
                "testIn\\тема                                                      111 1490211649326 4096\n");
    }
    @Test
    @Tag("lh-d")
    void lh_d() throws IOException {
        assertEquals(commandLine("ls -l -h testIn"), "Ace_Stream_Media_3.1.2.exe                                xrw   последние изменение 18.03.2016 05:33:05   75MB\n" +
                "AdbeRdr930_ru_RU.exe                                      xrw   последние изменение 21.07.2010 09:09:36   24MB\n" +
                "atheros_ar5xxx_ar9xxx_wireless_10_0_0_298_whql.zip        xrw   последние изменение 03.08.2015 09:23:47   77MB\n" +
                "avast_free_antivirus_setup_online_comss.exe               xrw   последние изменение 06.08.2015 06:49:06   5MB\n" +
                "Delphi7_Lite_Full_Setup_v7.3.3.3v3(Build_2010-02-02).exe  xrw   последние изменение 11.05.2010 02:05:30   62MB\n" +
                "DTLiteInstaller.exe                                       xrw   последние изменение 07.08.2015 04:08:02   1MB\n" +
                "Git-2.10.0-64-bit.exe                                     xrw   последние изменение 08.09.2016 08:38:47   31MB\n" +
                "K-Lite_Codec_Pack_960_Mega.exe                            xrw   последние изменение 15.12.2012 11:37:42   23MB\n" +
                "KMPlayer 2.9.4.1434 Final.exe                             xrw   последние изменение 03.06.2012 08:18:39   28MB\n" +
                "mseinstall.exe                                            xrw   последние изменение 04.12.2013 06:15:58   13MB\n" +
                "online-consultant.exe                                     xrw   последние изменение 21.12.2015 09:38:28   15MB\n" +
                "TeamViewerPortable                                        xrw   последние изменение 22.03.2017 10:41:26   (Папка) 4KB\n" +
                "teeworlds-0.5.1-win32                                     xrw   последние изменение 22.03.2017 10:39:45   (Папка) 0Bait\n" +
                "Tor Browser                                               xrw   последние изменение 22.03.2017 10:40:28   (Папка) 0Bait\n" +
                "тема                                                      xrw   последние изменение 22.03.2017 10:40:49   (Папка) 4KB\n");
    }
}