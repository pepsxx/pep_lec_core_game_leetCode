package Pp_T02.Pp_L04_LinkedList_2;

import java.util.Arrays;

public class Pc_MyLinkedList { // Односвязный и не параметризованный.
    private Pc_Node po_head;
    private int pgi_size;

    public void pf_add(int pmi_value) {
        // Если это первое добавление
        if (po_head == null) {
            this.po_head = new Pc_Node(pmi_value);
        } else {
            Pc_Node po_temp = po_head;
            while (po_temp.getPo_Next() != null) {
                po_temp = po_temp.getPo_Next();
            }
            po_temp.setPo_Next(new Pc_Node(pmi_value));
        }
        pgi_size++;
    }

    public int pf_get(int pmi_index) {
        int pmi_curentIndex = 0;
        Pc_Node po_temp = po_head;
        while (po_temp != null) {
            if (pmi_curentIndex == pmi_index) {
                return po_temp.getPgi_value();
            } else {
                po_temp = po_temp.getPo_Next();
                pmi_curentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void pf_remove(int pmi_index) {
        if (pmi_index == 0) {
            po_head = po_head.getPo_Next();
            pgi_size--;
            return;
        }
        int pmi_curentIndex = 0;
        Pc_Node po_temp = po_head;
        while (po_temp != null) {
            if (pmi_curentIndex == pmi_index - 1) {
                po_temp.setPo_Next(po_temp.getPo_Next().getPo_Next());
                pgi_size--;
                return;
            } else {
                po_temp = po_temp.getPo_Next();
                pmi_curentIndex++;
            }
        }
    }

    public String toString() {
        int[] pmMi_result = new int[pgi_size];
        int pmi_idx = 0;
        Pc_Node po_temp = po_head;
        while (po_temp != null) {
            pmMi_result[pmi_idx++] = po_temp.getPgi_value();
            po_temp = po_temp.getPo_Next();
        }
        return Arrays.toString(pmMi_result);
    }

    private static class Pc_Node {
        private int pgi_value;
        private Pc_Node po_Next;

        public Pc_Node(int pgi_value) {
            this.pgi_value = pgi_value;
        }

        public int getPgi_value() {
            return pgi_value;
        }

        public void setPgi_value(int pgi_value) {
            this.pgi_value = pgi_value;
        }

        public Pc_Node getPo_Next() {
            return po_Next;
        }

        public void setPo_Next(Pc_Node po_Next) {
            this.po_Next = po_Next;
        }
    }
}
