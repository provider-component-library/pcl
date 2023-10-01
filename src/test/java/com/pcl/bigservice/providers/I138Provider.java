package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I138Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b13Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i159Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i192Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		
        try {
            Thread.sleep(34);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p2Val = b3Provider.get(request);
		int p3Val = b4Provider.get(request);
		int p4Val = b10Provider.get(request);
		int p5Val = b13Provider.get(request);
		int p6Val = b16Provider.get(request);
		int p7Val = b17Provider.get(request);
		int p8Val = b18Provider.get(request);
		int p9Val = b21Provider.get(request);
		int p10Val = b25Provider.get(request);
		int p11Val = b28Provider.get(request);
		int p12Val = b29Provider.get(request);
		int p13Val = b31Provider.get(request);
		int p14Val = b32Provider.get(request);
		int p15Val = b36Provider.get(request);
		int p16Val = b37Provider.get(request);
		int p17Val = b39Provider.get(request);
		int p18Val = b40Provider.get(request);
		int p19Val = b42Provider.get(request);
		int p20Val = b44Provider.get(request);
		int p21Val = b47Provider.get(request);
		int p22Val = b48Provider.get(request);
		int p23Val = b50Provider.get(request);
		int p24Val = i141Provider.get(request);
		int p25Val = i144Provider.get(request);
		int p26Val = i145Provider.get(request);
		int p27Val = i149Provider.get(request);
		int p28Val = i151Provider.get(request);
		
        try {
            Thread.sleep(89);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p29Val = i152Provider.get(request);
		int p30Val = i154Provider.get(request);
		int p31Val = i155Provider.get(request);
		int p32Val = i159Provider.get(request);
		int p33Val = i166Provider.get(request);
		int p34Val = i172Provider.get(request);
		int p35Val = i173Provider.get(request);
		int p36Val = i174Provider.get(request);
		int p37Val = i177Provider.get(request);
		
        try {
            Thread.sleep(44);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p38Val = i179Provider.get(request);
		int p39Val = i180Provider.get(request);
		int p40Val = i181Provider.get(request);
		int p41Val = i182Provider.get(request);
		int p42Val = i183Provider.get(request);
		int p43Val = i185Provider.get(request);
		int p44Val = i188Provider.get(request);
		int p45Val = i189Provider.get(request);
		int p46Val = i192Provider.get(request);

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
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val +
				p46Val;
    }
}
