package assginment4;

/**
 * @author zhou
 * @see 4.将字符数组中的小写字母转化为大写字母
 */
public class CharArrayExample {
    public static void main(String[] args)
    {
        char[] ch = {'S','t','r','i','n','g'};
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] >= 'a' && ch[i] <= 'z')
            {
                ch[i] = (char) (ch[i] - 32);
            }
        }
        String result = new String(ch);
        System.out.println("转化后为"+result);
    }
}
