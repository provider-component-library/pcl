package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I178Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        
        try {
            Thread.sleep(47);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p1Val = b1Provider.get(request);
		
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p2Val = b2Provider.get(request);
		int p3Val = b6Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b10Provider.get(request);
		int p6Val = b13Provider.get(request);
		int p7Val = b16Provider.get(request);
		int p8Val = b21Provider.get(request);
		int p9Val = b23Provider.get(request);
		int p10Val = b25Provider.get(request);
		int p11Val = b27Provider.get(request);
		int p12Val = b34Provider.get(request);
		int p13Val = b35Provider.get(request);
		int p14Val = b36Provider.get(request);
		int p15Val = b39Provider.get(request);
		
        try {
            Thread.sleep(39);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p16Val = b43Provider.get(request);
		int p17Val = b44Provider.get(request);
		int p18Val = b48Provider.get(request);
		int p19Val = b49Provider.get(request);
		int p20Val = i181Provider.get(request);
		int p21Val = i184Provider.get(request);
		int p22Val = i188Provider.get(request);
		int p23Val = i189Provider.get(request);
		int p24Val = i190Provider.get(request);
		int p25Val = i192Provider.get(request);
		int p26Val = i195Provider.get(request);
		int p27Val = i198Provider.get(request);

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
				p27Val;
    }
}
