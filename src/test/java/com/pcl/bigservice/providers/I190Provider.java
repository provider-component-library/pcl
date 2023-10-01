package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I190Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b8Provider.get(request);
		int p4Val = b11Provider.get(request);
		int p5Val = b16Provider.get(request);
		int p6Val = b17Provider.get(request);
		int p7Val = b18Provider.get(request);
		int p8Val = b21Provider.get(request);
		
        try {
            Thread.sleep(26);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p9Val = b22Provider.get(request);
		int p10Val = b23Provider.get(request);
		int p11Val = b24Provider.get(request);
		int p12Val = b26Provider.get(request);
		int p13Val = b27Provider.get(request);
		int p14Val = b28Provider.get(request);
		int p15Val = b30Provider.get(request);
		
        try {
            Thread.sleep(63);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p16Val = b34Provider.get(request);
		int p17Val = b39Provider.get(request);
		int p18Val = b41Provider.get(request);
		int p19Val = b43Provider.get(request);
		int p20Val = b46Provider.get(request);
		int p21Val = b48Provider.get(request);
		int p22Val = b49Provider.get(request);
		
        try {
            Thread.sleep(68);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p23Val = i193Provider.get(request);
		int p24Val = i194Provider.get(request);
		int p25Val = i199Provider.get(request);

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
				p25Val;
    }
}
