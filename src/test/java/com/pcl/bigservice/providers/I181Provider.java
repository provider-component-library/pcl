package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I181Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b3Provider.get(request);
		
        try {
            Thread.sleep(67);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p3Val = b4Provider.get(request);
		int p4Val = b5Provider.get(request);
		int p5Val = b6Provider.get(request);
		int p6Val = b9Provider.get(request);
		int p7Val = b10Provider.get(request);
		int p8Val = b17Provider.get(request);
		int p9Val = b18Provider.get(request);
		int p10Val = b19Provider.get(request);
		int p11Val = b21Provider.get(request);
		int p12Val = b23Provider.get(request);
		int p13Val = b24Provider.get(request);
		int p14Val = b29Provider.get(request);
		int p15Val = b36Provider.get(request);
		
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p16Val = b42Provider.get(request);
		int p17Val = b47Provider.get(request);
		int p18Val = b50Provider.get(request);
		int p19Val = i182Provider.get(request);
		int p20Val = i184Provider.get(request);
		
        try {
            Thread.sleep(53);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = i185Provider.get(request);
		int p22Val = i186Provider.get(request);
		int p23Val = i191Provider.get(request);
		int p24Val = i196Provider.get(request);
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
