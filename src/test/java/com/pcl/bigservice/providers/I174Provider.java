package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I174Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b12Provider;
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
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b5Provider.get(request);
		int p2Val = b10Provider.get(request);
		int p3Val = b11Provider.get(request);
		int p4Val = b12Provider.get(request);
		int p5Val = b14Provider.get(request);
		int p6Val = b15Provider.get(request);
		int p7Val = b16Provider.get(request);
		int p8Val = b18Provider.get(request);
		int p9Val = b19Provider.get(request);
		int p10Val = b21Provider.get(request);
		int p11Val = b22Provider.get(request);
		int p12Val = b24Provider.get(request);
		int p13Val = b25Provider.get(request);
		int p14Val = b37Provider.get(request);
		int p15Val = b40Provider.get(request);
		int p16Val = b41Provider.get(request);
		
        try {
            Thread.sleep(68);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p17Val = b49Provider.get(request);
		int p18Val = i175Provider.get(request);
		int p19Val = i177Provider.get(request);
		int p20Val = i183Provider.get(request);
		int p21Val = i185Provider.get(request);
		int p22Val = i190Provider.get(request);
		
        try {
            Thread.sleep(42);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p23Val = i192Provider.get(request);
		int p24Val = i194Provider.get(request);
		int p25Val = i195Provider.get(request);
		
        try {
            Thread.sleep(81);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p26Val = i196Provider.get(request);
		int p27Val = i197Provider.get(request);
		int p28Val = i200Provider.get(request);

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
