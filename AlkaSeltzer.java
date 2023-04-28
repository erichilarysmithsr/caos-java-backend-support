import java.util.Scanner;

public class AlkaSeltzer {

    public static void main(String[] args) {

        // Define the reactants and products.
        Reactant[] reactants = {new Reactant("NaHCO3"), new Reactant("H3C6H5O7")};
        Product[] products = {new Product("Na3C6H5O7"), new Product("H2O"), new Product("CO2")};

        // Write the balanced chemical equation.
        String equation = reactants[0].name + " + " + reactants[1].name + " <=> " + products[0].name + " + " + products[1].name + " + " + products[2].name;

        // Calculate the equilibrium constant.
        double Keq = Math.exp(-(-91.05 / 8.31446261815324 * (298.15)));

        // Plot the equilibrium curve.
        double[] x = new double[100];
        double[] y = new double[100];
        for (int i = 0; i < 100; i++) {
            x[i] = i / 100.0;
            y[i] = Keq * x[i] * x[i];
        }
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Equilibrium Curve for the Reaction of Alka-Seltzer",
                "Concentration of NaHCO3 (mol/L)",
                "Concentration of CO2 (mol/L)",
                new XYDataset() {

                    @Override
                    public int getSeriesCount() {
                        return 1;
                    }

                    @Override
                    public int getItemCount(int series) {
                        return 100;
                    }

                    @Override
                    public double getXValue(int series, int item) {
                        return x[item];
                    }

                    @Override
                    public double getYValue(int series, int item) {
                        return y[item];
                    }
                });

        chart.setBackgroundPaint(Color.WHITE);
        chart.getTitle().setPaint(Color.BLACK);
        chart.getLegend().setBackgroundPaint(Color.WHITE);
        chart.getLegend().setBorderPaint(Color.BLACK);

        JFrame frame = new JFrame("Equilibrium Curve for the Reaction of Alka-Seltzer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));

        panel.add(new ChartPanel(chart));

        frame.add(panel);
        frame.setVisible(true);
    }
}

class Reactant {

    String name;

    public Reactant(String name) {
        this.name = name;
    }
}

class Product {

    String name;

    public Product(String name) {
        this.name = name;
    }
}
