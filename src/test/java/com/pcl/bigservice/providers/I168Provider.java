package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I168Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i194Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b4Provider.get(request);
		
        try {
            Thread.sleep(66);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p4Val = b7Provider.get(request);
		
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p5Val = b8Provider.get(request);
		int p6Val = b10Provider.get(request);
		int p7Val = b11Provider.get(request);
		int p8Val = b14Provider.get(request);
		int p9Val = b15Provider.get(request);
		int p10Val = b16Provider.get(request);
		int p11Val = b17Provider.get(request);
		int p12Val = b18Provider.get(request);
		int p13Val = b21Provider.get(request);
		int p14Val = b26Provider.get(request);
		int p15Val = b30Provider.get(request);
		int p16Val = b31Provider.get(request);
		int p17Val = b36Provider.get(request);
		int p18Val = b37Provider.get(request);
		int p19Val = b39Provider.get(request);
		int p20Val = b40Provider.get(request);
		
        try {
            Thread.sleep(63);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p21Val = b43Provider.get(request);
		int p22Val = b48Provider.get(request);
		int p23Val = b49Provider.get(request);
		int p24Val = i171Provider.get(request);
		int p25Val = i179Provider.get(request);
		int p26Val = i180Provider.get(request);
		int p27Val = i184Provider.get(request);
		int p28Val = i185Provider.get(request);
		int p29Val = i186Provider.get(request);
		int p30Val = i187Provider.get(request);
		int p31Val = i188Provider.get(request);
		int p32Val = i192Provider.get(request);
		int p33Val = i193Provider.get(request);
		int p34Val = i194Provider.get(request);

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
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val;
    }
}
