package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I165Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i167Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i197Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b6Provider.get(request);
		int p3Val = b8Provider.get(request);
		int p4Val = b13Provider.get(request);
		int p5Val = b15Provider.get(request);
		int p6Val = b16Provider.get(request);
		int p7Val = b18Provider.get(request);
		int p8Val = b19Provider.get(request);
		int p9Val = b20Provider.get(request);
		
        try {
            Thread.sleep(74);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(32);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p10Val = b21Provider.get(request);
		int p11Val = b22Provider.get(request);
		int p12Val = b30Provider.get(request);
		int p13Val = b31Provider.get(request);
		int p14Val = b33Provider.get(request);
		int p15Val = b36Provider.get(request);
		
        try {
            Thread.sleep(38);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p16Val = b38Provider.get(request);
		int p17Val = b39Provider.get(request);
		int p18Val = b46Provider.get(request);
		int p19Val = b48Provider.get(request);
		int p20Val = b50Provider.get(request);
		int p21Val = i166Provider.get(request);
		int p22Val = i167Provider.get(request);
		int p23Val = i168Provider.get(request);
		int p24Val = i169Provider.get(request);
		int p25Val = i170Provider.get(request);
		int p26Val = i173Provider.get(request);
		int p27Val = i177Provider.get(request);
		int p28Val = i182Provider.get(request);
		int p29Val = i183Provider.get(request);
		int p30Val = i184Provider.get(request);
		int p31Val = i185Provider.get(request);
		int p32Val = i186Provider.get(request);
		int p33Val = i190Provider.get(request);
		int p34Val = i192Provider.get(request);
		int p35Val = i195Provider.get(request);
		int p36Val = i197Provider.get(request);

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
				p36Val;
    }
}
