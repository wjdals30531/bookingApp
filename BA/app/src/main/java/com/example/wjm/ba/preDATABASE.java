public class preDATABASE extends Activity{
	
	
	//패치가 필요할때마다 충분히 값을 바꿔야할것
	//만약 서귀포구장+3이 생겼다면
	//if로 서귀포구장+3 == null 이면 IsUpdated = true;가 되게 아직은 그냥 true해서 항상 저장하게
	public static boolean IsUpdated = true;
	
	
	
	 public void saveStringPreferences(String str,String str2){
        SharedPreferences pref = getSharedPreferences(str,0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(str,str2);
        editor.commit();
	 }
		
	void save_NewJeju{
		saveStringPreferences("신제주 A구장","신제주구장"+0);
        saveStringPreferences("1234567","신제주번호"+0);
        saveStringPreferences("신제주 A구장가격","신제주가격"+0);


        saveStringPreferences("신제주 B구장","신제주구장"+1);
        saveStringPreferences("신제주 B구장 번호","신제주번호"+1);
        saveStringPreferences("신제주 B구장가격","신제주가격"+1);
	}
	void save_OldJeju{
		saveStringPreferences("구제주 A구장","구제주구장"+0);
        saveStringPreferences("구제주 A구장 번호","구제주번호"+0);
        saveStringPreferences("구제주 A구장가격","구제주가격"+0);

        saveStringPreferences("구제주 B구장","구제주구장"+1);
        saveStringPreferences("구제주 B구장 뭐였드라","구제주번호"+1);
        saveStringPreferences("구제주 B구장가격","구제주가격"+1);
	}
	
	void save_SoeGwipo{
		saveStringPreferences("서귀포 A구장","서귀포구장"+0);
        saveStringPreferences("서귀포 A구장 뭐였드라","서귀포번호"+0);
        saveStringPreferences("서귀포 A구장가격","서귀포가격"+0);

        saveStringPreferences("서귀포 B구장","서귀포"+1);
        saveStringPreferences("서귀포 B구장 뭐였지","서귀포번호"+1);
        saveStringPreferences("서귀포 B구장가격","서귀포가격"+1);
		
	}
}