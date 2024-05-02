package Pp_T03_AliAdv.Pp_L04_List_LinkedList_2.Pp_t_L;

import java.util.Arrays;

public class Pc_t_LinkedList {
    private int pgi_t_size;
    private Pc_t_Node po_t_head;

    public void pf_t_add(int pgi_t_val) {

        if (this.po_t_head == null) this.po_t_head = new Pc_t_Node(pgi_t_val);
        else {
            Pc_t_Node po_t_temp = po_t_head;
            while (po_t_temp.getPo_t_NextNode() != null) {
                po_t_temp = po_t_temp.getPo_t_NextNode();
            }
            po_t_temp.setPo_t_NextNode(new Pc_t_Node(pgi_t_val));
        }
        pgi_t_size++;
    }

    public int pf_t_get(int pmi_index) {
        if (pmi_index >= pgi_t_size) {
            System.out.println("Превышение");
            throw new IllegalArgumentException();
        }
        int pmi_check = 0;
        Pc_t_Node po_t_temp = po_t_head;
        while (po_t_temp != null) {
            if (pmi_check == pmi_index) {
                return po_t_temp.getPgi_t_val();
            } else po_t_temp = po_t_temp.getPo_t_NextNode();
            pmi_check++;
        }
        throw new IllegalArgumentException();
    }

    public void pf_t_rem(int pmi_index) {
        int pmi_check = 0;
        Pc_t_Node po_t_temp = po_t_head;
        if (pmi_index == 0) {
            po_t_head = po_t_temp.getPo_t_NextNode();
            pgi_t_size--;
        }
        while (po_t_temp != null)
            if (pmi_index - 1 == pmi_check) {
                po_t_temp.setPo_t_NextNode(po_t_temp.getPo_t_NextNode().getPo_t_NextNode());
                pgi_t_size--;
                return;
            } else {
                po_t_temp = po_t_temp.getPo_t_NextNode();
                pmi_check++;
            }
    }

    @Override
    public String toString() {
        int[] pmMi_mas = new int[pgi_t_size];
        Pc_t_Node po_t_temp = po_t_head;
        for (int i = 0; i < pmMi_mas.length; i++) {
            pmMi_mas[i] = po_t_temp.pgi_t_val;
            po_t_temp = po_t_temp.getPo_t_NextNode();
        }
        return Arrays.toString(pmMi_mas);

    }

    private static class Pc_t_Node {
        private int pgi_t_val;

        private Pc_t_Node po_t_NextNode;

        public Pc_t_Node(int pgi_t_val) {
            this.pgi_t_val = pgi_t_val;
        }

        public int getPgi_t_val() {
            return pgi_t_val;
        }

        public Pc_t_Node getPo_t_NextNode() {
            return po_t_NextNode;
        }

        public void setPo_t_NextNode(Pc_t_Node po_t_NextNode) {
            this.po_t_NextNode = po_t_NextNode;
        }

    }


}

