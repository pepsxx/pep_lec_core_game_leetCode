package Pp_T03.Pp_L04_List_LinkedList_2.Pp_t_A;

import java.util.Arrays;

public class Pc_t_ArrayList {
    private int[] pgMi_masMain = new int[0];

    public void pf_t_add(int pgi_t_val) {
        int[] pmMi_tmp = new int[pgMi_masMain.length + 1];
        for (int i = 0; i < pgMi_masMain.length; i++) pmMi_tmp[i] = pgMi_masMain[i];
        pmMi_tmp[pgMi_masMain.length] = pgi_t_val;
        pgMi_masMain = pmMi_tmp;
    }

    public int pf_t_get(int pmi_index) {
        return pgMi_masMain[pmi_index];
    }

    public void pf_t_rem(int pmi_index) {
        if (pgMi_masMain.length == 0) {
            System.out.println("Нечего удалять");
            return;
        }
        int[] pmMi_tmp = new int[pgMi_masMain.length - 1];
        int pmi_smesh = 0;
        for (int i = 0; i < pmMi_tmp.length; i++) {
            if (pmi_index == i) pmi_smesh = 1;
            pmMi_tmp[i] = pgMi_masMain[i + pmi_smesh];
        }
        pgMi_masMain = pmMi_tmp;
    }

    @Override
    public String toString() {
        return Arrays.toString(pgMi_masMain);

    }
}

