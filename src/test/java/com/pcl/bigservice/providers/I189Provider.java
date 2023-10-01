package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I189Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b10Provider;
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
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b33Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b41Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> i194Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i198Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b4Provider.get(request);
		
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p4Val = b6Provider.get(request);
		int p5Val = b7Provider.get(request);
		int p6Val = b8Provider.get(request);
		int p7Val = b9Provider.get(request);
		int p8Val = b10Provider.get(request);
		int p9Val = b13Provider.get(request);
		int p10Val = b14Provider.get(request);
		int p11Val = b15Provider.get(request);
		int p12Val = b16Provider.get(request);
		int p13Val = b18Provider.get(request);
		int p14Val = b23Provider.get(request);
		int p15Val = b25Provider.get(request);
		int p16Val = b26Provider.get(request);
		
        try {
            Thread.sleep(70);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p17Val = b28Provider.get(request);
		int p18Val = b33Provider.get(request);
		int p19Val = b34Provider.get(request);
		int p20Val = b35Provider.get(request);
		int p21Val = b37Provider.get(request);
		int p22Val = b40Provider.get(request);
		int p23Val = b41Provider.get(request);
		int p24Val = b43Provider.get(request);
		
        try {
            Thread.sleep(45);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i194Provider.get(request);
		int p26Val = i195Provider.get(request);
		int p27Val = i198Provider.get(request);
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
