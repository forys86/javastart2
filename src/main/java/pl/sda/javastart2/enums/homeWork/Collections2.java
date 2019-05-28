package pl.sda.javastart2.enums.homeWork;

/*public class Collections2 {

   public static void main(String[] args) {
        giveMeNameAndSurnameList();
        giveMeNameAndSurnameListWithStream();
        salaryStats();
        salaryStatsWithStream();
        Map<String, Map<Double, Integer>> nameSalaryStats=nameSalaryStats();
    }

    private static void iterateOverMap(Map<String,Map<Double, Integer>>nameSalaryStats){
        for (String name:nameSalaryStats.keySet()){
            System.out.println(name);
        }
        for (Map<Double, Integer> innerMap : nameSalaryStats.values()){
            System.out.println(innerMap);
        }
        for (Map.Entry<String, Map<Double, Integer>> mapEntry : nameSalaryStats.entrySet()){
            System.out.println(mapEntry);
        }
    }
    private static Map<Double, List<Customer>> salaryWithPersonListWithStream() {
        return giveMeCustomers()
                .stream()
                .collect(Collectors.groupingBy(e -> e.getSalary()));
    }

    private static Map<Double, List<Customer>> salaryWithPersonList() {
        List<Customer> customers = giveMeCustomers();
        Map<Double, List<Customer>> map = new HashMap<>();
        for (Customer customer : customers) {
            if (map.containsKey(customer.getSalary())) {
                List<Customer> customersInsideMap
                        = map.get(customer.getSalary());
                customersInsideMap.add(customer);
            } else {
                /*
                List<Customer> newList = new ArrayList<>();
                newList.add(customer);
                */
             /*   map.put(customer.getSalary(), Lists.newArrayList(customer));
            }
        }
        return map;
    }
    //napisz metode ktora zworci mape map <imie,<zarobki, liczba osob z takimi zarobkami>>
    private static void  nameSalaryStats(){
        List<Customer> customers=giveMeCustomers();
        Map<String, Map<double, Integer>> resultMap=Maps.newHashMap();
        for (Customer customer:customers){
            if (resultMap.containsKey(customer.getImie())){

            }
            else{
                //sytuacja kiedy imie nie istnieje w mapie
                Map<double, Integer> newMap=Maps.newHashMap;
                newMap.put(customer.getSalary(),1);
                resultMap.put(customer.getImie()newMap);
            }
            return
        }
    }

    private static Map<Double, Long> salaryStatsWithStream() {
        return giveMeCustomers().stream()
                .collect(Collectors.groupingBy(
                        e -> e.getSalary(),
                        Collectors.counting()
                        )
                );
    }

    protected static Map<Double, Integer> salaryStats() {
        List<Customer> customers = giveMeCustomers();
        Map<Double, Integer> map = Maps.newHashMap();
        for (Customer customer : customers) {
            if (map.containsKey((customer.getSalary()))) {
                Integer integer = map.get(customer.getSalary());
                map.replace(customer.getSalary(), integer + 1);
            } else {
                map.put(customer.getSalary(), 1);
            }
        }
        return map;
    }

    private static List<String> giveMeNameAndSurnameListWithStream() {
        return giveMeCustomers().stream()
                .map(e -> e.getImie().trim() + " " + e.getNazwisko().trim())
                .collect(Collectors.toList());
    }//crtl+shift+T Nowy TEST

    private static List<String> giveMeNameAndSurnameList() {
        List<Customer> customers = giveMeCustomers();
//        List<String> result = new ArrayList<>();
        List<String> result = Lists.newArrayList();
        for (Customer customer : customers) {
            String nameWithSurname = customer.getImie().trim()
                    + " " + customer.getNazwisko().trim();
            result.add(nameWithSurname);
        }
        return result;
    }

    //    Napiszcie klasę Customer, która będzie reprezentować dane
// z tablicy + będzie dobierać kolejne id dla kolejnych tworzonych
// obiektów -> Anna powinna otrzymać id = 1 a Marek id = 3
    public static List<Customer> giveMeCustomers() {
        Customer[] people = new Customer[]{
                new Customer("Anna", "Nowak   ", 33, "1200"),
                new Customer("Beata", "Kowalska", 22, "1200"),
                new Customer("Marek", " Nowak", 25, "1250"),
                new Customer("Adam", "Twardowski", 33, "1100"),
                new Customer("Monika  ", "Kos", 25, "2500"),
                new Customer("Adam ", "Rudy", 45, "3333"),
                new Customer("Marek", "Rudy", 15, 2210),
                new Customer("Adam", "Madej", 15, 3333)
        };
        return Arrays.asList(people);
    }
    //    Napisz metodę, która przyjmie tablicę people
// i zwróci listę Stringów <imię nazwisko>
// (elementem listy będzie np "Anna Nowak")


}*/
