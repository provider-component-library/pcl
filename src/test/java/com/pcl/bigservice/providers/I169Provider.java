package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I169Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i174Provider;
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
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b6Provider.get(request);
		int p3Val = b12Provider.get(request);
		int p4Val = b13Provider.get(request);
		int p5Val = b18Provider.get(request);
		int p6Val = b19Provider.get(request);
		int p7Val = b20Provider.get(request);
		int p8Val = b23Provider.get(request);
		int p9Val = b24Provider.get(request);
		int p10Val = b26Provider.get(request);
		int p11Val = b28Provider.get(request);
		
        try {
            Thread.sleep(63);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(49);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(37);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p12Val = b33Provider.get(request);
		int p13Val = b38Provider.get(request);
		int p14Val = b43Provider.get(request);
		int p15Val = b44Provider.get(request);
		int p16Val = b45Provider.get(request);
		int p17Val = b46Provider.get(request);
		int p18Val = b47Provider.get(request);
		int p19Val = b49Provider.get(request);
		int p20Val = i170Provider.get(request);
		int p21Val = i171Provider.get(request);
		int p22Val = i174Provider.get(request);
		int p23Val = i181Provider.get(request);
		int p24Val = i182Provider.get(request);
		int p25Val = i183Provider.get(request);
		int p26Val = i185Provider.get(request);
		int p27Val = i186Provider.get(request);
		int p28Val = i192Provider.get(request);
		int p29Val = i195Provider.get(request);
		int p30Val = i196Provider.get(request);
		int p31Val = i200Provider.get(request);

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
				p31Val;
    }
}
