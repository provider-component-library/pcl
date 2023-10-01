package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I160Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i199Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b9Provider.get(request);
		int p4Val = b14Provider.get(request);
		int p5Val = b16Provider.get(request);
		int p6Val = b17Provider.get(request);
		int p7Val = b19Provider.get(request);
		int p8Val = b24Provider.get(request);
		int p9Val = b25Provider.get(request);
		int p10Val = b29Provider.get(request);
		int p11Val = b33Provider.get(request);
		int p12Val = b34Provider.get(request);
		int p13Val = b35Provider.get(request);
		int p14Val = b36Provider.get(request);
		int p15Val = b39Provider.get(request);
		int p16Val = b41Provider.get(request);
		
        try {
            Thread.sleep(62);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p17Val = b42Provider.get(request);
		int p18Val = b43Provider.get(request);
		int p19Val = b44Provider.get(request);
		int p20Val = b46Provider.get(request);
		int p21Val = b47Provider.get(request);
		int p22Val = b48Provider.get(request);
		int p23Val = b49Provider.get(request);
		int p24Val = i163Provider.get(request);
		int p25Val = i164Provider.get(request);
		int p26Val = i167Provider.get(request);
		int p27Val = i170Provider.get(request);
		int p28Val = i172Provider.get(request);
		int p29Val = i173Provider.get(request);
		int p30Val = i176Provider.get(request);
		int p31Val = i177Provider.get(request);
		int p32Val = i180Provider.get(request);
		int p33Val = i181Provider.get(request);
		int p34Val = i184Provider.get(request);
		int p35Val = i188Provider.get(request);
		
        try {
            Thread.sleep(72);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p36Val = i193Provider.get(request);
		int p37Val = i194Provider.get(request);
		
        try {
            Thread.sleep(42);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p38Val = i195Provider.get(request);
		int p39Val = i199Provider.get(request);
		int p40Val = i200Provider.get(request);

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
				p40Val;
    }
}
