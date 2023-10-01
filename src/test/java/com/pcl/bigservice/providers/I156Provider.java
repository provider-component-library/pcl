package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I156Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b3Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b8Provider.get(request);
		int p5Val = b9Provider.get(request);
		
        try {
            Thread.sleep(28);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p6Val = b10Provider.get(request);
		int p7Val = b12Provider.get(request);
		int p8Val = b13Provider.get(request);
		int p9Val = b17Provider.get(request);
		int p10Val = b18Provider.get(request);
		int p11Val = b22Provider.get(request);
		int p12Val = b24Provider.get(request);
		int p13Val = b27Provider.get(request);
		int p14Val = b29Provider.get(request);
		int p15Val = b30Provider.get(request);
		int p16Val = b32Provider.get(request);
		int p17Val = b37Provider.get(request);
		int p18Val = b38Provider.get(request);
		int p19Val = b39Provider.get(request);
		int p20Val = b40Provider.get(request);
		int p21Val = b43Provider.get(request);
		int p22Val = i158Provider.get(request);
		int p23Val = i159Provider.get(request);
		int p24Val = i160Provider.get(request);
		
        try {
            Thread.sleep(57);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i162Provider.get(request);
		int p26Val = i166Provider.get(request);
		int p27Val = i170Provider.get(request);
		int p28Val = i172Provider.get(request);
		int p29Val = i173Provider.get(request);
		int p30Val = i177Provider.get(request);
		
        try {
            Thread.sleep(62);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p31Val = i178Provider.get(request);
		int p32Val = i180Provider.get(request);
		int p33Val = i181Provider.get(request);
		int p34Val = i182Provider.get(request);
		int p35Val = i186Provider.get(request);
		int p36Val = i187Provider.get(request);
		int p37Val = i193Provider.get(request);
		int p38Val = i195Provider.get(request);
		int p39Val = i197Provider.get(request);

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
				p39Val;
    }
}
