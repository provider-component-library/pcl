package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I120Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i127Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i181Provider;
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
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i198Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b3Provider.get(request);
		int p3Val = b4Provider.get(request);
		int p4Val = b5Provider.get(request);
		int p5Val = b14Provider.get(request);
		int p6Val = b18Provider.get(request);
		
        try {
            Thread.sleep(21);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p7Val = b24Provider.get(request);
		int p8Val = b25Provider.get(request);
		int p9Val = b32Provider.get(request);
		int p10Val = b34Provider.get(request);
		int p11Val = b35Provider.get(request);
		int p12Val = b36Provider.get(request);
		int p13Val = b43Provider.get(request);
		int p14Val = b44Provider.get(request);
		
        try {
            Thread.sleep(74);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p15Val = b48Provider.get(request);
		int p16Val = b50Provider.get(request);
		int p17Val = i121Provider.get(request);
		int p18Val = i127Provider.get(request);
		int p19Val = i128Provider.get(request);
		int p20Val = i134Provider.get(request);
		int p21Val = i137Provider.get(request);
		int p22Val = i139Provider.get(request);
		int p23Val = i140Provider.get(request);
		int p24Val = i141Provider.get(request);
		int p25Val = i142Provider.get(request);
		int p26Val = i143Provider.get(request);
		int p27Val = i144Provider.get(request);
		int p28Val = i145Provider.get(request);
		int p29Val = i146Provider.get(request);
		int p30Val = i148Provider.get(request);
		int p31Val = i149Provider.get(request);
		int p32Val = i152Provider.get(request);
		
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p33Val = i155Provider.get(request);
		int p34Val = i156Provider.get(request);
		int p35Val = i165Provider.get(request);
		int p36Val = i166Provider.get(request);
		int p37Val = i172Provider.get(request);
		int p38Val = i174Provider.get(request);
		int p39Val = i176Provider.get(request);
		int p40Val = i177Provider.get(request);
		int p41Val = i178Provider.get(request);
		int p42Val = i179Provider.get(request);
		int p43Val = i180Provider.get(request);
		int p44Val = i181Provider.get(request);
		int p45Val = i184Provider.get(request);
		int p46Val = i185Provider.get(request);
		int p47Val = i186Provider.get(request);
		int p48Val = i187Provider.get(request);
		int p49Val = i188Provider.get(request);
		int p50Val = i193Provider.get(request);
		int p51Val = i198Provider.get(request);

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
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val;
    }
}
