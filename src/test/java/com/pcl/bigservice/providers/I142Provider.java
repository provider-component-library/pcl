package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I142Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		
        try {
            Thread.sleep(77);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p2Val = b3Provider.get(request);
		int p3Val = b4Provider.get(request);
		int p4Val = b6Provider.get(request);
		int p5Val = b11Provider.get(request);
		int p6Val = b12Provider.get(request);
		int p7Val = b13Provider.get(request);
		int p8Val = b15Provider.get(request);
		int p9Val = b19Provider.get(request);
		
        try {
            Thread.sleep(51);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p10Val = b20Provider.get(request);
		int p11Val = b21Provider.get(request);
		int p12Val = b22Provider.get(request);
		int p13Val = b25Provider.get(request);
		int p14Val = b31Provider.get(request);
		int p15Val = b33Provider.get(request);
		int p16Val = b36Provider.get(request);
		int p17Val = b38Provider.get(request);
		int p18Val = b40Provider.get(request);
		int p19Val = b44Provider.get(request);
		int p20Val = b46Provider.get(request);
		int p21Val = b50Provider.get(request);
		int p22Val = i143Provider.get(request);
		int p23Val = i144Provider.get(request);
		int p24Val = i149Provider.get(request);
		
        try {
            Thread.sleep(81);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i151Provider.get(request);
		int p26Val = i153Provider.get(request);
		int p27Val = i154Provider.get(request);
		int p28Val = i155Provider.get(request);
		int p29Val = i156Provider.get(request);
		int p30Val = i163Provider.get(request);
		int p31Val = i164Provider.get(request);
		int p32Val = i167Provider.get(request);
		int p33Val = i172Provider.get(request);
		int p34Val = i173Provider.get(request);
		int p35Val = i176Provider.get(request);
		int p36Val = i177Provider.get(request);
		int p37Val = i183Provider.get(request);
		int p38Val = i188Provider.get(request);
		int p39Val = i190Provider.get(request);
		int p40Val = i192Provider.get(request);
		int p41Val = i195Provider.get(request);
		int p42Val = i196Provider.get(request);

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
				p42Val;
    }
}
