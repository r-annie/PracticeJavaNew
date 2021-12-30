public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        float[] patientsTemperatures = new float [patientsCount];
        int maxTemp = 40;
        int minTemp = 32;
        maxTemp -= minTemp + 1;
        for (int i = 0; i < patientsCount; i++)
        patientsTemperatures[i] = (float)((Math.random() *maxTemp) + minTemp);
        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {

        String temperatureString = "";
        int healthPatients = 0;
        double sumTemperature = 0.0;
        for (int i = 0; i < temperatureData.length; i++) {
            if (temperatureData[i] >= 36.2 && temperatureData[i] <= 37.2) {
                healthPatients++;
            }
            double temperature = Math.round(temperatureData[i] * 10.0) / 10.0;
            temperatureString = temperatureString + " " + temperature;
            sumTemperature = sumTemperature + Double.parseDouble(String.valueOf(temperatureData[i]));
        }

        double averageTemperature = sumTemperature / temperatureData.length;

        String report =
                "Температуры пациентов: " + temperatureString.trim() +
                        "\nСредняя температура: " + (Math.round(averageTemperature * 100.0) / 100.0) +
                        "\nКоличество здоровых: " + healthPatients;

        return report;
    }
}
