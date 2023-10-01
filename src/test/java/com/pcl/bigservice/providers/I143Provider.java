package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I143Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b15Provider;
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
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i147Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i158Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i198Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b8Provider.get(request);
		int p2Val = b10Provider.get(request);
		int p3Val = b15Provider.get(request);
		int p4Val = b19Provider.get(request);
		int p5Val = b21Provider.get(request);
		int p6Val = b22Provider.get(request);
		int p7Val = b24Provider.get(request);
		int p8Val = b25Provider.get(request);
		int p9Val = b27Provider.get(request);
		int p10Val = b29Provider.get(request);
		int p11Val = b32Provider.get(request);
		
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p12Val = b38Provider.get(request);
		int p13Val = b39Provider.get(request);
		
        try {
            Thread.sleep(87);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p14Val = b40Provider.get(request);
		int p15Val = b42Provider.get(request);
		int p16Val = b43Provider.get(request);
		int p17Val = b47Provider.get(request);
		int p18Val = b50Provider.get(request);
		int p19Val = i144Provider.get(request);
		int p20Val = i145Provider.get(request);
		int p21Val = i146Provider.get(request);
		int p22Val = i147Provider.get(request);
		int p23Val = i149Provider.get(request);
		int p24Val = i151Provider.get(request);
		int p25Val = i153Provider.get(request);
		int p26Val = i158Provider.get(request);
		int p27Val = i159Provider.get(request);
		int p28Val = i160Provider.get(request);
		int p29Val = i161Provider.get(request);
		int p30Val = i163Provider.get(request);
		int p31Val = i172Provider.get(request);
		int p32Val = i175Provider.get(request);
		int p33Val = i181Provider.get(request);
		int p34Val = i182Provider.get(request);
		int p35Val = i184Provider.get(request);
		int p36Val = i185Provider.get(request);
		int p37Val = i192Provider.get(request);
		
        try {
            Thread.sleep(27);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p38Val = i196Provider.get(request);
		int p39Val = i197Provider.get(request);
		int p40Val = i198Provider.get(request);
		int p41Val = i199Provider.get(request);

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
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val +
				p41Val;
    }
}
