package solid;

import java.util.List;

public class AntiD {

    public class Pen {

    }

    public class Pencil {

    }

    public class Backpack{

        private List<Pen> pens;

        private List<Pencil> pencils;

        public void addPen(Pen pen) {

            pens.add(pen);

        }

        public void addPencil(Pencil pencil) {

            pencils.add(pencil);

        }
    }
}
