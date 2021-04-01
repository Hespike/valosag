public class Naprendszer {
    int valosagos(Bolygo[] bolygok, int darabszam) {
        for (int i = 1; i < darabszam; i++) {
            if (bolygok[i].kozetbolygo == 1 && bolygok[i-1].kozetbolygo == 0) {
                return 0;
            }
        }

        return 1;
    }
}
