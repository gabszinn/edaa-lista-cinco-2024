import java.time.LocalDate;
import java.util.Arrays;

public class Programa {
    public static void main(String[] args) {
 LocalDate dataRegistro = LocalDate.now();
    System.out.println("Data de registro de execução: " + dataRegistro );
int[] placas = {
1008, 1012, 1014, 1021, 1026, 1028, 1035, 1040, 1046, 1051,
1052, 1054, 1062, 1069, 1072, 1076, 1078, 1081, 1082, 1084,
1089, 1095, 1102, 1105, 1113, 1122, 1132, 1135, 1139, 1146,
1151, 1154, 1170, 1171, 1174, 1178, 1180, 1191, 1202, 1203,
1208, 1210, 1223, 1225, 1233, 1234, 1236, 1237, 1243, 1255,
1263, 1279, 1286, 1287, 1288, 1296, 1304, 1307, 1309, 1313,
1315, 1319, 1324, 1326, 1332, 1340, 1355, 1356, 1358, 1365,
1367, 1370, 1371, 1374, 1377, 1383, 1386, 1392, 1396, 1397,
1398, 1413, 1423, 1433, 1434, 1437, 1440, 1442, 1448, 1463,
1464, 1466, 1472, 1475, 1477, 1483, 1484, 1487, 1489, 1492,
1493, 1494, 1503, 1504, 1506, 1509, 1515, 1516, 1518, 1521,
1528, 1536, 1542, 1544, 1546, 1555, 1562, 1563, 1567, 1576,
1579, 1589, 1597, 1607, 1610, 1612, 1613, 1620, 1622, 1623,
1629, 1633, 1636, 1639, 1640, 1644, 1646, 1655, 1674, 1682,
1684, 1686, 1687, 1694, 1701, 1705, 1706, 1716, 1718, 1729,
1736, 1737, 1738, 1744, 1769, 1770, 1774, 1794, 1803, 1804,
1813, 1829, 1831, 1832, 1839, 1840, 1841, 1844, 1848, 1850,
1851, 1853, 1860, 1866, 1884, 1886, 1894, 1895, 1897, 1898,
1901, 1908, 1912, 1928, 1929, 1932, 1938, 1954, 1957, 1958,
1960, 1962, 1968, 1976, 1977, 1978, 1993, 1996, 1997, 2000};

    Arrays.sort(placas);

        buscarMomento(placas, 1860);
        buscarMomento(placas, 1440);
        buscarMomento(placas, 1521);
        buscarMomento(placas, 1040);
        buscarMomento(placas, 1225);
        buscarMomento(placas, 1370);
        buscarMomento(placas, 1579);
        buscarMomento(placas, 1901);
        buscarMomento(placas, 1515);
        buscarMomento(placas, 1770);
        buscarMomento(placas, 1620);
        buscarMomento(placas, 1095);
        buscarMomento(placas, 1263);
        buscarMomento(placas, 1105);
    }

    public static void buscarMomento(int[] placas, int placa) {
        int indice = BuscaBinaria.buscaBinaria(placas, placa);
        if (indice != -1) {
        System.out.println("Carro/Placa: " + placa + ", foi o " +(indice + 1) + "º carro que trafegou na via.");
            System.out.println("Posição na via: " + (indice + 1));
            System.out.println();
        } else {
            System.out.println("Carro/Placa: " + placa + " não foi encontrado na via.");
            System.out.println();
        }
    } }