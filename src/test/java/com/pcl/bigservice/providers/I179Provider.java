package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I179Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b4Provider.get(request);
		
        try {
            Thread.sleep(83);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p3Val = b5Provider.get(request);
		int p4Val = b9Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b12Provider.get(request);
		int p7Val = b13Provider.get(request);
		int p8Val = b15Provider.get(request);
		int p9Val = b18Provider.get(request);
		int p10Val = b20Provider.get(request);
		int p11Val = b26Provider.get(request);
		int p12Val = b28Provider.get(request);
		int p13Val = b29Provider.get(request);
		int p14Val = b30Provider.get(request);
		
        try {
            Thread.sleep(38);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p15Val = b32Provider.get(request);
		int p16Val = b33Provider.get(request);
		int p17Val = b39Provider.get(request);
		int p18Val = b41Provider.get(request);
		int p19Val = b46Provider.get(request);
		int p20Val = b48Provider.get(request);
		int p21Val = b50Provider.get(request);
		int p22Val = i181Provider.get(request);
		
        try {
            Thread.sleep(28);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p23Val = i182Provider.get(request);
		int p24Val = i184Provider.get(request);
		int p25Val = i189Provider.get(request);
		int p26Val = i192Provider.get(request);
		int p27Val = i197Provider.get(request);
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
