package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I176Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b11Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b3Provider.get(request);
		int p4Val = b7Provider.get(request);
		int p5Val = b8Provider.get(request);
		int p6Val = b10Provider.get(request);
		int p7Val = b11Provider.get(request);
		int p8Val = b13Provider.get(request);
		int p9Val = b15Provider.get(request);
		int p10Val = b17Provider.get(request);
		int p11Val = b18Provider.get(request);
		
        try {
            Thread.sleep(36);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p12Val = b19Provider.get(request);
		int p13Val = b21Provider.get(request);
		int p14Val = b24Provider.get(request);
		int p15Val = b25Provider.get(request);
		int p16Val = b26Provider.get(request);
		int p17Val = b30Provider.get(request);
		int p18Val = b32Provider.get(request);
		int p19Val = b34Provider.get(request);
		int p20Val = b35Provider.get(request);
		int p21Val = b45Provider.get(request);
		int p22Val = b48Provider.get(request);
		int p23Val = i179Provider.get(request);
		int p24Val = i181Provider.get(request);
		
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p25Val = i183Provider.get(request);
		int p26Val = i184Provider.get(request);
		int p27Val = i186Provider.get(request);
		int p28Val = i187Provider.get(request);
		int p29Val = i196Provider.get(request);
		int p30Val = i197Provider.get(request);
		int p31Val = i199Provider.get(request);
		
        try {
            Thread.sleep(47);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p32Val = i200Provider.get(request);

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
				p32Val;
    }
}
