package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I173Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b4Provider.get(request);
		int p2Val = b8Provider.get(request);
		int p3Val = b9Provider.get(request);
		int p4Val = b12Provider.get(request);
		int p5Val = b15Provider.get(request);
		int p6Val = b17Provider.get(request);
		int p7Val = b18Provider.get(request);
		
        try {
            Thread.sleep(89);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p8Val = b19Provider.get(request);
		
        try {
            Thread.sleep(61);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p9Val = b23Provider.get(request);
		int p10Val = b25Provider.get(request);
		int p11Val = b27Provider.get(request);
		int p12Val = b28Provider.get(request);
		int p13Val = b29Provider.get(request);
		int p14Val = b32Provider.get(request);
		int p15Val = b38Provider.get(request);
		int p16Val = b41Provider.get(request);
		int p17Val = b44Provider.get(request);
		int p18Val = b45Provider.get(request);
		
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p19Val = b48Provider.get(request);
		int p20Val = b49Provider.get(request);
		int p21Val = i174Provider.get(request);
		int p22Val = i175Provider.get(request);
		int p23Val = i176Provider.get(request);
		int p24Val = i183Provider.get(request);
		int p25Val = i184Provider.get(request);
		int p26Val = i185Provider.get(request);
		int p27Val = i193Provider.get(request);
		int p28Val = i199Provider.get(request);

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
				p28Val;
    }
}
