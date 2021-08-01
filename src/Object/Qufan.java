package Object;

/**
 * @author 摩西摩西
 * @date 2021/7/26  11:47
 **/
public class Qufan {
    public static void main(String[] args) {
        Qufan qufan = new Qufan();
        String aa=qufan.calcCheckSum
       ("1.00ZXWN1000HLRAGENT000001FBDLGCONFFFF00000002TXBEG 00FFQry User:IMSI=460014534378297,ITEM=ALL  ");
//       ("1.00ZXWN1000HLRAGENT00000000DLGLGNFFFF00000001TXBEG FFFFLOGIN:USER=AIGEJIE,PSWD=Yjcx&2021   ");
//        ("1.00ZXWN1000HLRAGENT000001FDLGCONFFFF00000003TXBEG FFFFLOGOUT: ");
        System.out.println(aa);
    }

    private String calcCheckSum(String msg) {
        byte[] arr = msg.getBytes();
        byte[] res = new byte[4];

        for (int i = 0; i < arr.length; i += 4) {
            res[0] ^= arr[i];
            res[1] ^= arr[i + 1];
            res[2] ^= arr[i + 2];
            res[3] ^= arr[i + 3];
        }

        res[0] = (byte) ~res[0];
        res[1] = (byte) ~res[1];
        res[2] = (byte) ~res[2];
        res[3] = (byte) ~res[3];

        String resStr = "";

        for (int i = 0; i < 4; i++) {
            resStr = resStr + byte2hex(res[i]);
        }

        return resStr;
    }

    private String byte2hex(byte b) {
        StringBuffer buf = new StringBuffer();
        char[] hexChars = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C',
                'D', 'E', 'F'
        };
        int high = ((b & 0xf0) >> 4);
        int low = (b & 0x0f);
        buf.append(hexChars[high]);
        buf.append(hexChars[low]);

        return buf.toString();
    }

}
