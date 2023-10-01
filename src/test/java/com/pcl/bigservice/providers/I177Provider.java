package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I177Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b8Provider.get(request);
		int p6Val = b9Provider.get(request);
		int p7Val = b10Provider.get(request);
		int p8Val = b16Provider.get(request);
		int p9Val = b17Provider.get(request);
		
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p10Val = b18Provider.get(request);
		int p11Val = b20Provider.get(request);
		int p12Val = b21Provider.get(request);
		int p13Val = b23Provider.get(request);
		int p14Val = b29Provider.get(request);
		int p15Val = b30Provider.get(request);
		int p16Val = b33Provider.get(request);
		int p17Val = b34Provider.get(request);
		int p18Val = b36Provider.get(request);
		int p19Val = b37Provider.get(request);
		int p20Val = b40Provider.get(request);
		int p21Val = b42Provider.get(request);
		int p22Val = i179Provider.get(request);
		
        try {
            Thread.sleep(22);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p23Val = i180Provider.get(request);
		int p24Val = i183Provider.get(request);
		int p25Val = i184Provider.get(request);
		int p26Val = i185Provider.get(request);
		int p27Val = i191Provider.get(request);
		
        try {
            Thread.sleep(67);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p28Val = i195Provider.get(request);
		int p29Val = i196Provider.get(request);
		int p30Val = i198Provider.get(request);

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
				p30Val;
    }
}
