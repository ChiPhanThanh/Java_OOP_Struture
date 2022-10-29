public class StringArt {
    public static  void main(String[] args){
        String n = "chao phan thanh chi";
        System.out.print(n + "\n");
        // charArt: trả ve thú tự kí tự
        System.out.print(n.charAt(3) + "\n");
        //codePointAt: Trả về số thứ tự kí tự trong bảng mã ASCII
        System.out.print(n.codePointAt(2));
        //concat: nối chuỗi
        //contains: tìm kiếm chuỗi  hiện thời -> truê -> false
        //replace:(old, new): t hay thees;
        //toCharArray
        //toLawerCase
        //toUpperCase
        //trim: xóa các ki tự khoảng trắng

    }

}
