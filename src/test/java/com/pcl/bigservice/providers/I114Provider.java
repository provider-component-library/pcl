package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I114Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b5Provider.get(request);
		int p2Val = b6Provider.get(request);
		int p3Val = b8Provider.get(request);
		int p4Val = b10Provider.get(request);
		int p5Val = b13Provider.get(request);
		int p6Val = b14Provider.get(request);
		int p7Val = b17Provider.get(request);
		int p8Val = b21Provider.get(request);
		int p9Val = b24Provider.get(request);
		int p10Val = b25Provider.get(request);
		int p11Val = b29Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b32Provider.get(request);
		int p14Val = b38Provider.get(request);
		int p15Val = b40Provider.get(request);
		int p16Val = b46Provider.get(request);
		int p17Val = b47Provider.get(request);
		int p18Val = i119Provider.get(request);
		int p19Val = i125Provider.get(request);
		int p20Val = i131Provider.get(request);
		
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = i135Provider.get(request);
		int p22Val = i136Provider.get(request);
		int p23Val = i137Provider.get(request);
		int p24Val = i138Provider.get(request);
		
        try {
            Thread.sleep(21);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i141Provider.get(request);
		int p26Val = i145Provider.get(request);
		int p27Val = i150Provider.get(request);
		int p28Val = i155Provider.get(request);
		int p29Val = i159Provider.get(request);
		
        try {
            Thread.sleep(26);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p30Val = i160Provider.get(request);
		int p31Val = i161Provider.get(request);
		int p32Val = i166Provider.get(request);
		int p33Val = i169Provider.get(request);
		int p34Val = i172Provider.get(request);
		int p35Val = i173Provider.get(request);
		int p36Val = i174Provider.get(request);
		int p37Val = i177Provider.get(request);
		int p38Val = i186Provider.get(request);
		int p39Val = i188Provider.get(request);
		int p40Val = i192Provider.get(request);
		int p41Val = i194Provider.get(request);
		int p42Val = i196Provider.get(request);
		int p43Val = i197Provider.get(request);
		int p44Val = i198Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val +
				p41Val +
				p42Val +
				p43Val +
				p44Val;
    }
}
