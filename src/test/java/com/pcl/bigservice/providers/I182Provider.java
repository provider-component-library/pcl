package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I182Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b5Provider.get(request);
		int p3Val = b8Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b12Provider.get(request);
		int p6Val = b16Provider.get(request);
		int p7Val = b17Provider.get(request);
		int p8Val = b18Provider.get(request);
		int p9Val = b22Provider.get(request);
		int p10Val = b23Provider.get(request);
		int p11Val = b24Provider.get(request);
		
        try {
            Thread.sleep(88);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p12Val = b25Provider.get(request);
		int p13Val = b28Provider.get(request);
		int p14Val = b32Provider.get(request);
		int p15Val = b34Provider.get(request);
		int p16Val = b35Provider.get(request);
		
        try {
            Thread.sleep(81);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p17Val = b38Provider.get(request);
		int p18Val = b39Provider.get(request);
		int p19Val = b40Provider.get(request);
		int p20Val = b45Provider.get(request);
		int p21Val = b47Provider.get(request);
		int p22Val = b48Provider.get(request);
		int p23Val = i184Provider.get(request);
		int p24Val = i185Provider.get(request);
		
        try {
            Thread.sleep(22);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i188Provider.get(request);
		int p26Val = i189Provider.get(request);
		int p27Val = i190Provider.get(request);
		int p28Val = i191Provider.get(request);
		int p29Val = i199Provider.get(request);

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
				p29Val;
    }
}
