public class Main {
    public static void main(String[] args) {

        System.out.println(convert("99"));
        System.out.println(convert("123"));
        System.out.println(convert("0"));


        Vehicle vehicle = new Vehicle("BMW", "mercedes", 1996);


    }
    public static Integer convert(String numbSt){
        return Integer.valueOf(numbSt);

    }

}

//1.დაწერე მეთოდი, რომელიც String-ად
//მიიღებს ციფრს და დააბრუნებს მის
//შესაბამის Integer-ს. მაგალითად: თუ
//შემოგვივიდა „99“ უნდა დავაბრუნოთ 99.
//ჩათვალე, რომ ყოველთვის შემოგდის
//მთელი ციფრები


//2.შექმენი კლასი Vehicle, რომელსაც ექნება
//სამი private ცლავდი: brand და modelName
//და releaseYear. დაწერე თიოთოეულისთვის
//გეთერი და სეთერი, ასევე გქონდეს ერთი
//კონსტრუქტორი, რომლებსაც სამივე
//ცვლადი უნდა ჩაეწოდებოდეს

//3.შექმენი კლასი Car, რომელიც
//გააფართოებს Vehicle კლასს. Car-ს უნდა
//ქონდეს დამატებით ფილდი: wheelCount,
//ასევე, უნდა ქონდეს კონსტრუქტორი,
//რომელსაც გადაეცემა wheelCount და
//Vehicle კლასის ფილდები. გადატვირთე
//toString() და დააბრუნე კლასის
//რეპრეზენტაცია Vehicle კლასის
//ფილდებთან ერთად