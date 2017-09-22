import { PolSocialNetWebPage } from './app.po';

describe('pol-social-net-web App', () => {
  let page: PolSocialNetWebPage;

  beforeEach(() => {
    page = new PolSocialNetWebPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
