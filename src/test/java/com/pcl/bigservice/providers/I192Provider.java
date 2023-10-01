package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I192Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b14Provider;
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
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i199Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b3Provider.get(request);
		int p3Val = b4Provider.get(request);
		int p4Val = b6Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b11Provider.get(request);
		int p7Val = b13Provider.get(request);
		int p8Val = b14Provider.get(request);
		int p9Val = b15Provider.get(request);
		int p10Val = b16Provider.get(request);
		
        try {
            Thread.sleep(35);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p11Val = b18Provider.get(request);
		
        try {
            Thread.sleep(89);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p12Val = b19Provider.get(request);
		int p13Val = b20Provider.get(request);
		int p14Val = b22Provider.get(request);
		int p15Val = b27Provider.get(request);
		int p16Val = b28Provider.get(request);
		int p17Val = b29Provider.get(request);
		int p18Val = b32Provider.get(request);
		int p19Val = b40Provider.get(request);
		int p20Val = b41Provider.get(request);
		int p21Val = b42Provider.get(request);
		int p22Val = b43Provider.get(request);
		int p23Val = i196Provider.get(request);
		int p24Val = i199Provider.get(request);
		
        try {
            Thread.sleep(70);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i200Provider.get(request);

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
