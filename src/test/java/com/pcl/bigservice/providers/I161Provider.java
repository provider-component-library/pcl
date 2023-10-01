package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I161Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i175Provider;
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
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i196Provider;

    @Override
    protected Integer getInternal(Request request) {
        
        try {
            Thread.sleep(29);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p1Val = b3Provider.get(request);
		int p2Val = b6Provider.get(request);
		int p3Val = b8Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b17Provider.get(request);
		
        try {
            Thread.sleep(68);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p6Val = b19Provider.get(request);
		int p7Val = b20Provider.get(request);
		int p8Val = b24Provider.get(request);
		int p9Val = b28Provider.get(request);
		int p10Val = b29Provider.get(request);
		int p11Val = b30Provider.get(request);
		int p12Val = b34Provider.get(request);
		int p13Val = b36Provider.get(request);
		
        try {
            Thread.sleep(28);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p14Val = b37Provider.get(request);
		int p15Val = b45Provider.get(request);
		int p16Val = b46Provider.get(request);
		int p17Val = i166Provider.get(request);
		int p18Val = i167Provider.get(request);
		int p19Val = i172Provider.get(request);
		int p20Val = i173Provider.get(request);
		int p21Val = i175Provider.get(request);
		int p22Val = i177Provider.get(request);
		int p23Val = i178Provider.get(request);
		int p24Val = i180Provider.get(request);
		int p25Val = i181Provider.get(request);
		int p26Val = i182Provider.get(request);
		int p27Val = i183Provider.get(request);
		int p28Val = i185Provider.get(request);
		int p29Val = i186Provider.get(request);
		int p30Val = i188Provider.get(request);
		int p31Val = i190Provider.get(request);
		int p32Val = i191Provider.get(request);
		int p33Val = i196Provider.get(request);

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
				p33Val;
    }
}
